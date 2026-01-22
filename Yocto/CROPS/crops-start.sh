#!/bin/bash
set -x

DOCKER_IMAGE=crops/poky:ubuntu-22.04

PROJECT_PATH=$(pwd -P)

# number of cores on the machine
NUM_CORES=$(nproc)
CPU_LIMIT=$(echo "($NUM_CORES * 0.8)/1" | bc) # 80% of the cores

# memory limit
MEMORY_LIMIT="25g"



echo "Starting docker image ${DOCKER_IMAGE}..."
docker run --rm -it \
    -v $(readlink -f ${SSH_AUTH_SOCK}):/ssh-agent -e SSH_AUTH_SOCK=/ssh-agent \
    -v "${HOME}/.gitconfig:/etc/gitconfig" \
    -v "${PROJECT_PATH}:${PROJECT_PATH}" \
    -w "${PROJECT_PATH}" \
    --cpus=${CPU_LIMIT} --memory=${MEMORY_LIMIT} \
    --network host \
    -v /dev/kvm:/dev/kvm \
    -v /dev/net/tun:/dev/net/tun \
    "${DOCKER_IMAGE}"
