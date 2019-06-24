package org.ccsl.gen.services.compositeFilterService;

import org.eclipse.emf.common.util.EList;

import ccsl.LogicOperator;
import ccsl.filters.CompositeFilter;
import ccsl.filters.Filter;

public class CompositeFilterService {

	
	private static void configNegated(CompositeFilter compositeFilter) {
		if(compositeFilter.isNegated()) {
			compositeFilter.setNegated(false);
			if(compositeFilter.getOperator() == LogicOperator.AND_LITERAL) {
				compositeFilter.setOperator(LogicOperator.OR_LITERAL);
			}else if(compositeFilter.getOperator() == LogicOperator.OR_LITERAL) {
				compositeFilter.setOperator(LogicOperator.AND_LITERAL);
			}
			for(Filter f : (EList<Filter>) compositeFilter.getFilters()) {
				f.setNegated(!f.isNegated());
				if(f instanceof CompositeFilter) {
					setup((CompositeFilter) f);
				}
			}
		}
	}
	
	public static void setup(CompositeFilter compositeFilter) {
		configNegated(compositeFilter);
	}
}
