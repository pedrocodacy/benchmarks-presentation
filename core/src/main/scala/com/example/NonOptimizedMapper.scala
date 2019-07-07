package com.example

object NonOptimizedMapper {


  private val artistToSong: Map[String,List[String]] = Map(
    "Tool" -> List("Lateralus", "Jambi", "Forty Six & 2", "Parabola", "Vicarious"),
    "Led Zeppelin" -> List("When the levee breaks", "Fool in the rain", "Kashmir", "Dazed and Confused"),
    "White Stripes" -> List("Catch Hell Blues", "Hotel Yorba", "Dead leaves and the dirty ground", "300 MPH Torrential Outpour Blues"),
    "Pink Floyd" -> List("Shine on you crazy diamond", "Wish you were here", "One of these days", "Set the controls for the heart of the sun"),
    "The Beatles" -> List("Come together", "Eleanor Rigby", "Tomorrow never knows", "Here comes the sun"),
    "Eric Clapton" -> List("Walkin Blues", "San Francisco Bay Blues", "Layla", "Nobody knows you when you're down and out"),
    "Jimi Hendrix" -> List("All along the watchtower", "Purple Haze", "Little Wing", "Voodoo Child"),
    "Curtis Mayfield" -> List("Pusherman", "Superfly", "Move on up"),
    "Gorillaz" -> List("On melancholy hill", "DARE", "Kids with guns", "Clint Eastwood", "Rock the house"),
    "Dream Theather" -> List("Stream of consciousness", "Panic Attack", "As I am", "Metropolis"),
    "Lamb of God" -> List("Ashes of the wake", "Faded Line", "Redneck", "In your words"),
    "Kendrick Lamar" -> List("King Kunta", "Money Trees", "Complexion", "Hood Politics"),
    "Fleetwood Mac" -> List("Dreams", "The Chain", "Go your own way", "Tusk"),
    "Queen" -> List("Bohemian Rhapsody", "Another one bites the dust", "Innuendo", "Under pressure"),
    "Radiohead" -> List("Paranoid Android", "The Numbers", "2 + 2 = 5", "15 Step", "Pyramid Song"),
    "The Doors" -> List("The end", "LA Woman", "Spanish caravan", "People are strange"),
    "Massive Attack" -> List("Paradise Circus", "Karmacoma", "Inertia Creeps", "Exchange"),
    "Tom Waits" -> List("Ice cream man", "Black market baby",  "Chocolate jesus", "Downtown train"),
    "Stevie Wonder" -> List("Superstition", "Sir Duke", "Higher Ground", "I wish"),
    "Megadeth" -> List("Holy Wars", "Symphony of Destruction", "Tornado of Souls", "Hangar 18"),
    "Gojira" -> List("Oroborus", "The heaviest matter in the universe", "The art of dying", "Flying Wales"),
    "David Bowie" -> List("Space Oddity", "Lets Dance", "China Girl", "Changes", "Ziggy Stardust"),
    "Anderson .Paak" -> List("Come down", "Put me thru", "The Bird", "King James"),
    "James Brown" -> List("Get up offa that thing", "The boss", "Living in america", "The payback"),
    "Nina Simone" -> List("I put a spell on you", "Sinnerman", "Aint got no", "I wish I knew how it would feel to be free")
  )

  def songs(artist: String): List[String] = {
    artistToSong.getOrElse(artist, List.empty[String])
  }

  def artist(song: String): String = {
    val songToArtist: Map[String, String] = artistToSong.foldLeft(Map.empty[String,String]) {
      case (accum, (artist, songs)) =>
        songs.foldLeft(accum)( (songsAccum, nextSong) => songsAccum + ( nextSong -> artist ) )
    }
    songToArtist.getOrElse(song, s"Artist for $song not found")
  }

}