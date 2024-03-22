
for i in range(3):
    a_start_hour, a_start_min, a_start_sec, a_end_hour, a_end_min, a_end_sec = map(int, input().split())

    sec = 0
    min = 0
    hour = 0

    if a_end_sec - a_start_sec < 0:
        a_end_min -= 1
        sec = a_end_sec + 60 - a_start_sec
    else:
        sec = a_end_sec - a_start_sec

    if a_end_min - a_start_min < 0:
        a_end_hour -= 1
        min = a_end_min + 60 - a_start_min
    else:
        min = a_end_min - a_start_min

    hour = a_end_hour - a_start_hour

    print(hour, min, sec)

