@RestController
class Minimal {
	
	@RequestMapping("/")
	def helloWorld() {
		"Hello World"
	}
}
