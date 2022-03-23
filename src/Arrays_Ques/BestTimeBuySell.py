def maxProfit(arr):
    left,right = 0,1
    max_profit = 0
    while(right < len(arr)):
        if arr[left] < arr[right]:
            profit = arr[right] - arr[left]
            max_profit = max(max_profit,profit)
        else:
            left = right
        right += 1
    return max_profit


print(maxProfit([7,1,5,3,6,4]))