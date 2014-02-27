/* 
   
 */


class Rules extends Rule {

    protected ArrayList<Rule> rules;

    public Rules() {
        rules = new ArrayList<Rule>();
    }

    public final boolean match(Move move) {
        for (Rule r: rules)
            if (!r.match(move)) return false;
        return true;
    }

    public final void addRule(Rule r) {
        rules.add(r);
    }


}
