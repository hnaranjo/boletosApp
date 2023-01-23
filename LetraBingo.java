public enum LetraBingo {

    B ( min : 1, max : 15, lon : 5 ), 
    I ( min : 16, max : 30, lon : 5 ), 
    N ( min : 31, max : 45, lon : 4 ), 
    G ( min : 46, max : 60, lon : 5 ), 
    O ( min : 61, max : 75, lon : 5 );

        private int min;
        private int max;
        private int lon;

        LetraBingo(int min, int max, int lon) {
            this.min = min;
            this.max = max;
            this.lon = lon;
        }

    public String getLetra(){
        return this.name();
    }

    public int getMin(){
        return min;
    }

    public int getMax(){
        return max;
    }

    public int getLon(){
        return lon;
    }
}
