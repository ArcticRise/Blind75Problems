def productOfArrayExceptSelf(nums):
    output = [1] * len(nums)
    temp = 1
    for i in range(len(nums)):
        output[i] = temp
        temp *= nums[i]
    temp2 = 1
    for i in range(len(nums)-1,-1,-1):
        output[i] *= temp2
        temp2 *= nums[i]
    return output

print(productOfArrayExceptSelf([1,2,3,4]))