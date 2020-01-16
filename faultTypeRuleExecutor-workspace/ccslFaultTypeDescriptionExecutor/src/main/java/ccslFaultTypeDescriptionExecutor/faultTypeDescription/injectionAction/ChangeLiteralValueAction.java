package ccslFaultTypeDescriptionExecutor.faultTypeDescription.injectionAction;

import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.BooleanLiteral;
import org.eclipse.gmt.modisco.java.CharacterLiteral;
import org.eclipse.gmt.modisco.java.NumberLiteral;
import org.eclipse.gmt.modisco.java.StringLiteral;

public class ChangeLiteralValueAction implements InjectionAction {

	private String getWrongNumber(String number) {
		try {
			int intNumber = Integer.parseInt(number);
			return Integer.toString(intNumber + 1);
		} catch (NumberFormatException ex) {
			// Not an Integer
		}

		try {
			float floatNumber = Float.parseFloat(number);
			return Float.toString(floatNumber + 1);
		} catch (NumberFormatException ex) {
			// Not a Float
		}

		try {
			double doubleNumber = Double.parseDouble(number);
			return Double.toString(doubleNumber + 1);
		} catch (NumberFormatException ex) {
			// Not a Double
		}

		try {
			long longNumber = Long.parseLong(number);
			return Long.toString(longNumber + 1);
		} catch (NumberFormatException ex) {
			// Not a Long
		}

		return number;
	}

	@Override
	public boolean doAction(ASTNode node) {
		if (node instanceof NumberLiteral) {
			NumberLiteral numberLiteral = (NumberLiteral) node;
			numberLiteral.setTokenValue(getWrongNumber(numberLiteral.getTokenValue()));
			return true;
		} else if (node instanceof StringLiteral) {
			StringLiteral stringLiteral = (StringLiteral) node;
			String escapedString = stringLiteral.getEscapedValue().substring(1,
					stringLiteral.getEscapedValue().length() - 1);
			stringLiteral.setEscapedValue("\"" + escapedString + "r" + "\"");
			return true;
		} else if (node instanceof CharacterLiteral) {
			CharacterLiteral characterLiteral = (CharacterLiteral) node;
			String lit = characterLiteral.getEscapedValue();
			if (lit.charAt(0) == '\'' && lit.charAt(lit.length() - 1) == '\'') {
				String subStr = lit.subSequence(1, lit.length() - 1).toString();
				int numericValue = (int) subStr.charAt(0);
				characterLiteral.setEscapedValue("\'" + Character.toString(numericValue + 1) + "\'");
			}
			return true;
		} else if (node instanceof BooleanLiteral) {
			BooleanLiteral booleanLiteral = (BooleanLiteral) node;
			booleanLiteral.setValue(!booleanLiteral.isValue());
			return true;
		}
		return false;
	}
}
