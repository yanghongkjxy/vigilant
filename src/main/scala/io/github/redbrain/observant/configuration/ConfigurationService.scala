package io.github.redbrain.observant.configuration

import io.github.redbrain.observant.aggregator.TransportType
import io.github.redbrain.observant.aggregator.udp.UDPTransport

/**
 * Created by redbrain on 25/11/2014.
 */
object ConfigurationService {

  def getCacheThreshold(): Int = 20

  def getTransportFromConfiguration(): TransportType = {
    new UDPTransport(8080)
  }

}
