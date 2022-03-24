import sys


def maxSubArray(nums):
    sum = 0
    max_val = -sys.maxsize
    for i in nums:
        sum += i
        max_val = max(sum,max_val)
        if sum < 0:
            sum = 0
    return max_val

print(maxSubArray([-2,1,-3,4,-1,2,1,-5,4]))