package main

import (
	"./myMath"
	"fmt"
	"net/http"
	"os"
	"runtime"
	"time"
)

//返回多个结果值
func split(sum int) (x, y int) {
	x = sum * 4 / 9
	y = sum - x
	return
}

func main() {
	fmt.Println("Hello World!")
	fmt.Println(mathClass.Add(1, 1))
	fmt.Println(mathClass.Sub(1, 1))
	//fmt.Println(mathClass.tt(1,1))
	fmt.Println(os.Args)
	fmt.Println(os.Hostname())
	fmt.Println(os.Getpid())
	fmt.Println(split(17))
	//同时接受多个变量的返回
	a, b := split(17)
	fmt.Println(a)
	fmt.Println(b)
	mathClass.TT()

	fmt.Println(mathClass.Pi)

	//标准声明变量
	var sum2 int = 0
	fmt.Println(sum2)
	//短声明变量（仅用于方法内，方法外部允许执行）
	sum3 := 0
	fmt.Println(sum3)

	sum := 0
	for i := 0; i < 10; i++ {
		sum += i
	}
	fmt.Println(sum)

	fmt.Print("Go runs on ")
	switch os := runtime.GOOS; os {
	case "darwin":
		fmt.Println("OS X.")
	case "linux":
		fmt.Println("Linux.")
	default:
		// freebsd, openbsd,
		// plan9, windows...
		fmt.Printf("%s.", os)
	}

	fmt.Println("When's Saturday?")
	today := time.Now().Weekday()
	switch time.Saturday {
	case today + 0:
		fmt.Println("Today.")
	case today + 1:
		fmt.Println("Tomorrow.")
	case today + 2:
		fmt.Println("In two days.")
	default:
		fmt.Println("Too far away.")
	}

	mathClass.Defer()

	i, j := 42, 2701

	p := &i         // point to i
	fmt.Println(*p) // read i through the pointer
	*p = 21         // set i through the pointer
	fmt.Println(i)  // see the new value of i

	p = &j         // point to j
	*p = *p / 37   // divide j through the pointer
	fmt.Println(j) // see the new value of j

	fmt.Println(Vertex{1, 2})

	v := Vertex{1, 2}
	v.X = 4
	fmt.Println(v.X)

	p2 := &v
	p2.X = 1e9
	fmt.Println(v)

}

func (h Hello) ServeHTTP(
	w http.ResponseWriter,
	r *http.Request) {
	fmt.Fprint(w, "Hello!")
}

type Hello struct{}
