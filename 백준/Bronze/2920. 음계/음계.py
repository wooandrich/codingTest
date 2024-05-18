original = [1,2,3,4,5,6,7,8]

arr = list(map(int,input().split()))

if original == arr:
    print("ascending")
elif original[::-1] == arr:
    print("descending")
else:
    print("mixed")