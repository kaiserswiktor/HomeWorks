<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:output method="html" />
	<xsl:template match="/Greenhouse">
		<table border="8">
			<xsl:apply-templates />
			<div>Greenhouse</div>
		</table>
	</xsl:template>	
	<xsl:template match="/Greenhouse/plants">
		<tr>
			<xsl:apply-templates />
		</tr>
	</xsl:template>
	
	<xsl:template match="/Greenhouse/plants/Name">
	<td> Plant:</td>
	
		<td>
			Name-<xsl:value-of select="text()" />
		</td>
	</xsl:template>
	<xsl:template match="/Greenhouse/plants/Soil">
		<td>
			Soil-<xsl:value-of select="text()" />
		</td>	
	</xsl:template>
	<xsl:template match="/Greenhouse/plants/Origin">
		<td>
			Origin-<xsl:value-of select="text()" />
		</td>	
	</xsl:template>
	<xsl:template match="/Greenhouse/plants/VisualParameters">
		<td>
		VisualParameters:<xsl:apply-templates />
		</td>
	</xsl:template>
	<xsl:template match="/Greenhouse/plants/VisualParameters/color">
		<td>
			color-<xsl:value-of select="text()" />
		</td>
	</xsl:template>
	<xsl:template match="/Greenhouse/plants/VisualParameters/colorSt">
		<td>
			colorSt-<xsl:value-of select="text()" />
		</td>
	</xsl:template>
	<xsl:template match="/Greenhouse/plants/VisualParameters/grow">
		<td>
		grow-<xsl:value-of select="text()" />
		</td>
	</xsl:template>
	<xsl:template match="/Greenhouse/plants/GrowTips">
		<td>
			GrowTips:<xsl:apply-templates />
		</td>
	</xsl:template>
	<xsl:template match="/Greenhouse/plants/GrowTips/t">
		<td>
			t-<xsl:value-of select="text()" />
		</td>
	</xsl:template>
	<xsl:template match="/Greenhouse/plants/GrowTips/water">
		<td>
			water-<xsl:value-of select="text()" />
		</td>
	</xsl:template>
	<xsl:template match="/Greenhouse/plants/Multiplying">
		<td>
			Multiplying-<xsl:value-of select="text()" />
		</td>
	</xsl:template>
</xsl:stylesheet>