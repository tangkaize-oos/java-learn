package com.liaoxuefeng.aQuickStart.gAbstract;

/**
 * @author: 李将
 * @since: 2020/5/28 12:27
 * @Descprition:
 */
public class StateCouncilSpecialAllowance extends Income {
    public StateCouncilSpecialAllowance(double income) {
        super(income);

    }

    @Override
    public double getTax() {
        return 0;
    }


}
