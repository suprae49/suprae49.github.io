fn main():
    name = "Supreme"
    age = 13
    print("Hello,", name)
    print('Age:', age)
    print(7 / 2, PI)

    counter = 1
    while counter <= 6:
        if counter == 3:
            print("three!")
        elif counter > 4 and counter < 6:
            print("big", counter)
        else:
            print(counter)
        counter += 1
        if counter == 6:
            break

    total = 0
    n = 1
    while n <= 10:
        total += n
        n = n + 1
    print("sum 1..10 =", total)
    msg = name
    print(msg)
