function calculateCrCl() {
  if (sexVar === "female") {
    creatinineClearance = Math.round((0.85 * ((140 - ageVar) / (creatinineVar)) * (weightVar / 72)) * 100) / 100
  } else {
    creatinineClearance = Math.round(((140 - ageVar) / (creatinineVar)) * (weightVar / 72) * 100) / 100
  }
}