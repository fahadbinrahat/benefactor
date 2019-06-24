package com.benefactor.core.financial.assessment;

public interface IOutcome {

	public static final int ASSESSMENT_SUCCESSFUL = 1;
	public static final int ASSESSMENT_FAILED = -1;
	public static final int REFERRED_FOR_MANUAL_DECISION = 0;
	public static final int ASSESSMENT_WITHHELD = -2;
}
