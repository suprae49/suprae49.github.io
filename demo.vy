fn main():
    name = "Supreme"
    age = 13
    print("Hello,", name)
    print('Age:', age)
    print(7 / 2, PI)

    count = 1
    while count <= 6:
        if count == 3:
            print("three!")
        elif count > 4 and count < 6:
            print("big", count)
        else:
            print(count)
        count += 1
        if count == 6:
            break

    total = 0
    n = 1
    while n <= 10:
        total += n
        n = n + 1
    print("sum 1..10 =", total)
    msg = name
    print(msg)
