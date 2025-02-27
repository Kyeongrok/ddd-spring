package com.osc.dddspring.conditions;

import com.osc.dddspring.domain.Screening;

public class SequenceCondition {
    private int sequence;

    public SequenceCondition(int sequence) {
        this.sequence = sequence;
    }

    public boolean isSatisfiedBy(Screening screening) {
        return sequence == screening.getSequence();
    }
}
