package main

import "fmt"

type Vertex2 struct {
	X, Y float64
}

func (v *Vertex2) Scale(f float64) {
	v.X = v.Y
}

func main() {
	v := &Vertex2{3, 4}
	v.Scale(5)
	fmt.Println(v.X)
}
