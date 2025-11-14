/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */

// execute the code here: https://pl.kotl.in/jvrx_eL6R?readOnly=false&theme=darcula
enum class Language {
	HTML,
	CSS,
	JAVASCRIPT,
	TYPESCRIPT,
	KOTLIN,
	MARKDOWN,
	SVG,
	REGEX
}

fun main() {
    class Programmer(var name: String, var userName: String, val languages: Array<Language>) {
        fun code() {
		for(language in languages) {
			println("I'm programming in $language")
		}
	}
	fun followers() {
		return println("https://github.com/$userName?tab=followers")
	}
	fun following() {
		return println("https://github.com/$userName?tab=following")
	}
}
val juan3178 = Programmer( "Juan3178", "juan3178316", arrayOf( Language.HTML, Language.CSS, Language.JAVASCRIPT, Language.TYPESCRIPT, Language.KOTLIN, Language.MARKDOWN, Language.SVG, Language.REGEX));
 println("${juan3178.name}")
juan3178.code()
juan3178.followers()
juan3178.following()
}
