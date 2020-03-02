package ocl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.ocl.pivot.ExpressionInOCL;
import org.eclipse.ocl.pivot.utilities.OCL;
import org.eclipse.ocl.pivot.utilities.ParserException;
import org.eclipse.ocl.pivot.utilities.Query;
public class OclQuery {

	private static final OclQuery INSTANCE = new OclQuery();
	
	private OclQuery() {
		
	}
	
	public static OclQuery getInstance() {
		return INSTANCE;
	}
	
	public Object evaluateQuery(String query, EClass context, Object model) throws ParserException {
		OCL oclInstance = OCL.newInstance();
		ExpressionInOCL expression = oclInstance.createQuery(context, query);
		Query queryEval = oclInstance.createQuery(expression);
		return queryEval.evaluateEcore(model);
	}
}
