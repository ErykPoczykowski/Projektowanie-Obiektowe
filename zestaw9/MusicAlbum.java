import java.util.Arrays;

public class MusicAlbum {
    private String title;
    private String artist;
    private double[] ratings;
    private int count;

    public MusicAlbum(String title, String artist) {
        this.title = title;
        this.artist = artist;
        this.ratings = new double[0];
        this.count = 0;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getArtist() {
        return artist;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }
    public double[] getRatings() {
        return Arrays.copyOf(ratings,count);
    }
    public void addRating(double rating) {
        if(count < ratings.length)
        {
            ratings[count] = rating;
            count++;
        }
        else
        {
            System.out.println("nie można dodać więcej ocen");
        }
    }
    public void removeRating(int index)
    {
        if(count>0)
        {
            count --;
            ratings[index] = 0;
        }
        else
        {
            System.out.println("brak ocen");
        }

    }
    @Override
    public String toString()
    {
        return "MusicAlbum{title = "+title+"; artist = "+artist+"; ratings = "+Arrays.toString(ratings)+"}";
    }
    @Override
    public boolean equals(Object obj)
    {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        MusicAlbum that = (MusicAlbum)obj;
        return title.equals(that.title) && artist.equals(that.artist);
    }

    public int hashcode()
    {
        return title.hashCode() + artist.hashCode();
    }

    class RockAlbum extends MusicAlbum
    {
        private String rockGenre;

        public RockAlbum(String title, String artist, String rockGenre)
        {
            super(title, artist);
            this.rockGenre = rockGenre;
        }
        public String getRockgenre()
        {
            return rockGenre;
        }
        public void setRockGenre()
        {
            this.rockGenre= rockGenre;
        }
        @Override
        public String toString()
        {
            return "RockAlbum{title = "+title+"; artist = "+artist+"; ratings = "+Arrays.toString(ratings)+"; rockGenre = "+rockGenre+"}";
        }
        @Override
        public boolean equals(Object o)
        {
            if(!super.equals(o)) return false;
            RockAlbum that = (RockAlbum)o;
            return rockGenre.equals(that.rockGenre);
        }
        @Override
        public int hashCode()
        {
            return super.hashCode() + rockGenre.hashCode();
        }

    }































}
