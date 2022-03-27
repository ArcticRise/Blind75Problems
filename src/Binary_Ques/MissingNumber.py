def missingNumber(nums):
    ans = len(nums)
    for i in range(len(nums)):
        ans += i - nums[i]
    return ans

#XOR
def missingNumbersXor(nums):
    ans = 0
    for i, n in enumerate(nums):
        ans ^= (i ^ n)
    return ans ^ (i+1)

#Purpose Of this is to sum without using + or -
print(missingNumber([3,0,1]))
print(missingNumbersXor([3,0,1]))