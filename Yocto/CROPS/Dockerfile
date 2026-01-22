FROM crops/poky:ubuntu-20.04

ENV DEBIAN_FRONTEND=noninteractive

USER root
# Update packages list
RUN apt-get update
#RUN echo "pokyuser:pokyuser" | chpasswd
#RUN adduser pokyuser sudo

# Install python tools
RUN apt-get install -y python3-pip
RUN apt-get install -y vim

RUN ["/bin/bash"]
