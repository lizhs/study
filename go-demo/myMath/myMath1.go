package mathClass

import "fmt"

var c, python, java bool = true, true, true

const Pi = 3.14

//首字母大写的名称是被导出的
func Add(x, y int) int {
	return x + y
}

//首字母小写的不被导出
func TT() {
	//java  可以动态的变成多种类型
	var c, python, java = true, false, "no!"
	fmt.Println(c, python, java)
}

//首字母小写的不被导出
func tt(x, y int) int {
	return x + y
}
