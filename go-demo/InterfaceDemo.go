package main

import (
	"fmt"
)

type Abser interface {
	Abs() int
}

type Vertex struct {
	X, Y int
}

func main() {
	var a Abser
	v := Vertex{3, 4}
	a = &v // a *Vertex 实现了 Abser
	fmt.Println(a.Abs())
}
func (v *Vertex) Abs() int {
	return v.X * v.Y
}
