package models

import play.api.db.slick.Config.driver._

case class Smi(id: Int, roNumber: String)

object Smis extends Table[Smi]("smi") {

  def id = column[Int]("id", O.PrimaryKey)
  def roNumber = column[String]("ro_number")

  def * = id ~ roNumber <> (Smi.apply _, Smi.unapply _)
}