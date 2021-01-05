from sys import stdin  # For input

initialData = []  # Empty list

number = int(stdin.readline())  # Getting the number of inputs

# Storing the data in the list by looping "number" times
for x in range(number):
    # Spliting the data from the whitespace
    time, distance = map(int, stdin.readline().split())
    initialData.append((time, distance))  # Adding it to the list

initialData.sort()  # Sorting the list

# Variables
currentIndex = 0
previousIndex = 0
currentSpeed = 0
velocity = 0

# Iterating through the list
for x in initialData:
    time = x[0]
    distance = x[1]
    if time == 0:
        currentIndex = distance
    else:
        velocity = float(abs(distance-currentIndex)/float(time-previousIndex))
        previousIndex = time
        currentIndex = distance
        if (currentSpeed < velocity):
            currentSpeed = velocity
print(currentSpeed)
