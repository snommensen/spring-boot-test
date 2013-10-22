package withgradle

import spock.lang.Specification
	
class WithGradleSpec extends Specification {
	
	def "index returns greeting"() {			
		given:
		def ctrl = new WithGradleCtrl()
		
		when:
		def result = ctrl.index()
			
		then:
		result == "Greetings from Spring Boot with Gradle!"
	}
}
