# Enter your code here. Read input from STDIN. Print output to STDOUT
def computeTN(a,b,n):
    if(n==2):    return b
    if(n==1):    return a
    if(n<=0):    return 0
    else:
        c=  computeTN(a,b,n-2)
        d= computeTN(a,b,n-1)    
        z=(d*d)+c
        return z;        



a,b,n=raw_input().split(" ")
a=int(a)
b=int(b)
n=int(n)
print(computeTN(a,b,n))