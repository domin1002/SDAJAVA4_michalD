class RnaTranscription {

    String transcribe(String dnaStrand) {
        int length = dnaStrand.length();
        StringBuilder str = new StringBuilder();
        for(int i=0; i<length; i++){
            switch (dnaStrand.charAt(i)) {
                case 'A' :
                    str.append("U");
                    break;
                case 'T' :
                    str.append("A");
                    break;
                case 'C' :
                    str.append("G");
                    break;
                case 'G' :
                    str.append("C");
                    break;
                default:
                    throw  new IllegalArgumentException("Invalid input");

            }
        }
        return str.toString();
    }

}
