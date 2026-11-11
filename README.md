# Java Interface Example

A small Java program that demonstrates an **interface** and a class that implements it.

## What It Demonstrates

```java
interface A {
    void eat();
}

class B implements A {
    @Override
    public void eat() {
        System.out.println("B can eat");
    }
}
```

- An interface declares methods without bodies. They are `public` and abstract by default.
- A class that `implements` the interface must provide every method.
- The implementing method must be declared `public`, because it cannot have weaker access than the interface method.

## Code Overview

| Type | Role |
|------|------|
| `A` | Interface with the method `eat()` |
| `B` | Implements `A` and defines `eat()` |
| `InterfaceDemo` | Contains `main`, creates a `B` object and calls `eat()` |

## Output

```
B can eat
```

## Requirements

- Java Development Kit (JDK) 8 or higher

## Getting Started

```bash
git clone https://github.com/<your-username>/<your-repo-name>.git
cd <your-repo-name>
javac InterfaceDemo.java
java InterfaceDemo
```

## Project Structure

```
.
├── InterfaceDemo.java
└── README.md
```

## Next Steps

- Add a second class that implements `A` in a different way
- Store a `B` object in a variable of type `A` and call `eat()`
- Compare interfaces with abstract classes
