
def f(x):
 y = 2 * x + 1
 if y < 10:
     return y, 1.5
 else:
     return y, 1.5

def main():
 z = f(10)[1]
 h = 2 * f(10)[0]

main()
