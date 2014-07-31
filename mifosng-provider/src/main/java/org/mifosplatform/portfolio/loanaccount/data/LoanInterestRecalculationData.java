package org.mifosplatform.portfolio.loanaccount.data;

import org.mifosplatform.infrastructure.core.data.EnumOptionData;
import org.mifosplatform.portfolio.calendar.data.CalendarData;

public class LoanInterestRecalculationData {

    private final Long id;
    private final Long loanId;
    private final EnumOptionData interestRecalculationCompoundingType;
    private final EnumOptionData rescheduleStrategyType;
    @SuppressWarnings("unused")
    private final CalendarData calendarData;

    public LoanInterestRecalculationData(final Long id, final Long loanId, final EnumOptionData interestRecalculationCompoundingType,
            final EnumOptionData rescheduleStrategyType, final CalendarData calendarData) {
        this.id = id;
        this.loanId = loanId;
        this.interestRecalculationCompoundingType = interestRecalculationCompoundingType;
        this.rescheduleStrategyType = rescheduleStrategyType;
        this.calendarData = calendarData;
    }

    public static LoanInterestRecalculationData withCalendarData(final LoanInterestRecalculationData recalculationData,
            final CalendarData calendarData) {
        return new LoanInterestRecalculationData(recalculationData.id, recalculationData.loanId,
                recalculationData.interestRecalculationCompoundingType, recalculationData.rescheduleStrategyType, calendarData);
    }

    public Long getId() {
        return this.id;
    }

}
