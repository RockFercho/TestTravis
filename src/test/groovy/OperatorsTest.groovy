import spock.lang.Specification
import spock.lang.Shared

/**
 * Created by fernando_hurtado on 14-12-15.
 */
class OperatorsTest extends Specification {
    @Shared Operators operators

    void setup() {
        operators = new Operators()
    }

    void "Checking if the symbol + is correct"() {
        given:
        String symbol = "+"
        expect:
        operator == operators.literal(symbol)
        where:
        operator = "add"
    }

    void "Checking if the symbol - is correct"() {
        given:
        String symbol = "-"
        expect:
        operator == operators.literal(symbol)
        where:
        operator = "substraction"
    }

    void "Checking if the symbol * is correct"() {
        given:
        String symbol = "*"
        expect:
        operator == operators.literal(symbol)
        where:
        operator = "otherss"
    }
}
