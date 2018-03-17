package smile.math.distance

import scala.math.pow

/**
 * @author Beck Gaël
 * Mean Mahantan distance class, it varies from Manhattan distance by averaging by sum of contingency table values
 * Here is a survey including this distance : http://www.iiisci.org/journal/CV$/sci/pdfs/GS315JG.pdf
 **/
class MeanMahanttan extends BinaryDistance {
	
	override def distance(vector1: Array[Int], vector2: Array[Int]) : Double = {
		val (a,b,c,d) = BinaryUtils.contingencyTable(vector1, vector2)
		(b + c).toDouble / (a + b + c + d)
	}
	
}