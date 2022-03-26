def getSum(a,b):
    while (b != 0):
        temp = (a & b) << 1
        a ^= b
        b = temp
    return a

#Purpose Of this is to sum without using + or -
print(getSum(9,11))