def canJump(nums):
    index = len(nums) - 1
    for i in range(len(nums)-1,-1,-1):
        if i + nums[i] >= index:
            index = i
    return index == 0

print(canJump([2,3,1,1,4]))