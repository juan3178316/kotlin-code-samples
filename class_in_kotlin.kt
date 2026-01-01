fun main() {
	class MyName(val name: String) {
		fun print() {
			println("Hi, my name is $name")
		}
	}
	class SampleText(val name: String, val age: Int, val profession: String) {
		fun print() {
			println("Hello, my name is $name and i\'m $age years old. I\'m a $profession and i enjoy my work. :3")
		}
	}
	class Sum2Values(var n1: Int, var n2: Int) {
		var n3: Int = n1 + n2
		fun print() {
			println("The result is: $n3")
		}
	}
	class Sum2FValues(var n1: Float, var n2: Float) {
		var n3: Float = n1 + n2
		fun print() {
			println("The result is: $n3")
		}
	}
	MyName("Juan3178").print()
	MyName("John").print()
	SampleText("Carl", 26, "Programmer").print()
	SampleText("Juan3178", 0, "System engineer").print() // XD
	Sum2Values(512,2048).print()
	Sum2FValues(3.14f,81.848f).print()
}