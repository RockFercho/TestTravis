/**
 * Created by fernando_hurtado on 14-12-15.
 */
class Operators {

    String literal(String symbol) {
        if(symbol == "+") {
            return "add"
        }
        else if(symbol == "-") {
            return "substraction"
        }
        else {
            return "other"
        }
    }
}
