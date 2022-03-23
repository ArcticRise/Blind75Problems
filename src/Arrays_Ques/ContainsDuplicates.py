def containsDuplicate(nums):
    se = set()
    for i in nums:
        if i in se:
            return True
        se.add(i)
    return False

print(containsDuplicate([1,2,3,1]))
print(containsDuplicate([1,2,3]))