package mathClass

import "fmt"

func Defer() {
	defer fmt.Println("world")
	fmt.Println("hello")

	fmt.Println("counting")

	for i := 0; i < 10; i++ {
		defer fmt.Println(i)
	}

	fmt.Println("done")
}

func Sub(x, y int) int {

	return x - y
}
