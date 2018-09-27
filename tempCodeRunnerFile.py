def list_of_primes(n):

    myList = []
    for i in range(2, n):
        if is_prime(i):
            myList.append(i)

    return myList


def is_prime(n):  # checks if a number is prime
    for i in range(2, int(n ** 0.5) + 1):
        if n % i == 0:
            return False
    return True

#Main Program
n = int(input("Enter a integer value: "))
result = list_of_primes(n)
print(result)
