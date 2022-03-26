def maxArea(height):
    left = 0
    right = len(height) - 1
    max_val = 0
    while (left < right):
        max_val = max(max_val, min(height[left], height[right]) * (right - left))
        if height[left] < height[right]:
            left += 1
        else:
            right -= 1
    return max_val

print(maxArea([1,8,6,2,5,4,8,3,7]))