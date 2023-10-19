package StringPractice;


class PetrolFilling {
    public String fillPetrol(Bike bike, int noOfLiters) {
        try {
            if (noOfLiters <= 0 || noOfLiters > bike.getTankCapacity()) {
                throw new OverflowException("Tank capacity is overflown");
            } else {
                return "Tank filled successfully";
            }
        } catch (OverflowException e) {
            return e.toString();
        }
    }
}