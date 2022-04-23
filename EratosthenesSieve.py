#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Sat Apr 23 13:18:53 2022

@author: monikapatel

Sieve of eratosthenes for prime numbers
"""

def sieve_of_ertosthenes(n:int):
    #to store the num
    
    # fill with true
    primes = [True for i in range(n+1)]
    
    
    
    j =2
    while (j*j<=n):
        if(primes[j]==True):
            for p in range(j*j,n+1,j):
                primes[p]=False
        
        j+=1
    
    # while ends
        
    for p in range(2, n+1):
        if primes[p]:
            print(p)
    pass


if __name__ == '__main__':
    n = int(input("Enter limit: "))
    print("Following are the prime numbers till",n),
   
    sieve_of_ertosthenes(n)
    
