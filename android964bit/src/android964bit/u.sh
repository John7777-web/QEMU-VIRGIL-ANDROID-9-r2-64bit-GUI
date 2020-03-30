#!/bin/sh
sudo brctl delif br0 tap0

sudo tunctl -d tap0

sudo brctl delif br0 enp4s0

sudo ifconfig br0 down

sudo brctl delbr br0

sudo ifconfig enp4s0 up

sudo dhclient -v enp4s0

release ip below

sudo dhclient -v -r enp4s0

request ip below

sudo dhclient -v enp4s0

bash



