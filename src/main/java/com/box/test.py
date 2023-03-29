# -*- coding: utf-8 -*-
import json
import os
import sys
import psutil
import time
import socket

def get_local_ip():
    if_list = []
    addrs = psutil.net_if_addrs()
    for _, net_card_info in addrs.items():
        for each_ip in net_card_info:
            if each_ip.family == socket.AF_INET:
                if_list.append(each_ip.address)
                if each_ip.address == '10.20.31.194':
                    1/0
    return if_list
get_local_ip()
test = {
  "name":"zhangsan"
}


print json.dumps({'cmdb_result': [test]}, ensure_ascii=False, indent=4)