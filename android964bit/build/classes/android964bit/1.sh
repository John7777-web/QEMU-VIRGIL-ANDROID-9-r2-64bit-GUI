#!/bin/sh
sudo apt install qemu qemu-kvm libvirt-bin bridge-utils virt-manager

sudo apt install net-tools

sudo apt-get install uml-utilities

sudo brctl addbr br0

sudo ip tuntap add dev tap0 mode tap

sudo ip link set tap0 up promisc on

sudo ip addr flush dev enp4s0

sudo brctl addif br0 enp4s0

sudo tunctl -t tap0 -u `whoami`

sudo brctl addif br0 tap0

sudo ifconfig enp4s0 up

sudo ifconfig tap0 up

sudo ifconfig br0 up

sudo chown root:kvm /dev/kvm

sudo chmod 660 /dev/kvm

ls -l /dev/kvm 

sudo adduser $USER kvm

sudo snap connect qemu-virgil:kvm

sudo dhclient -v br0

systemctl restart libvirtd.service

echo "Rebooting in 5 minutes - abort with CTRL+C" && sleep 300 && reboot

bash
