package edu.umass.cs.iesl.wikilink.expanded

import edu.umass.cs.iesl.wikilink.expanded.data.WikiLinkItem

/**
 * Created by Noam on 6/13/2016.
 */
class ToJson {
  def main(args: Array[String]) {
    val path: Array[String] = new Array[String](1)
    path(1) = "/Users/davidmueller/Code/nlp_final/NEDforNoisyText/data/wikilinks/unzipped"
    val it = WikiLinkItemIterator("/Users/davidmueller/Code/nlp_final/NEDforNoisyText/data/wikilinks/unzipped")
    println("success!")
    return
  }
}
