public abstract class Player {
     private String name;
     private int skill;
     private ThrowBehavior throwBehavior;
     private DefendBehavior defendBehavior;
     private CatchBehavior catchBehavior;

    public void setThrowBehavior(ThrowBehavior throwBehavior){
        this.throwBehavior = throwBehavior;
    }

    public void setDefendBehavior(DefendBehavior defendBehavior){
        this.defendBehavior = defendBehavior;
    }

    public void setCatchBehavior(CatchBehavior catchBehavior){
        this.catchBehavior = catchBehavior;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getSkill()
    {
        return skill;
    }

    public void setSkill(int skill)
    {
        this.skill = skill;
    }

    public int throwBall(String name, int skill) {
        return throwBehavior.throwBall(name, skill);
    }

    public int catchPass(String name, int skill) {
        return catchBehavior.catchBall(name, skill);
    }

    public int defendPass(String name, int skill) {
        return defendBehavior.defend(name, skill);
    }



    public void playGame(int qbSkill, int wrSkill, int defSkill) {

        int offSkill = (qbSkill + wrSkill) / 2;
        int defenseSkill = defSkill;

        if(defenseSkill > defenseSkill){
            System.out.println("Touchdown!");
        }
        else if (offSkill == defenseSkill){
            System.out.println("Incomplete!");
        }
        else {
            System.out.println("Interception!");
        }

    }



}