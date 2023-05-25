package com.bldea.crorepathiapp.package1;
import java.util.*;
public class Questions {
		static String result;
		static String result2;
		static int count_life_line = 3;
		static int aud_phn = 1;
		static int cnt_50_50 = 1;
		static int skip_cnt=1;
		static Scanner sc = new Scanner(System.in);

		public static boolean fetchQuestion1(String name) throws Exception {
			System.out.println("1. Who is the founder of Java?");
			System.out.println("a) Dennis Ritchie\n" + "b) Charles Babbage\n" + "c) Rahul Gandhi\n" + "d) James Gosling\n"
					+ "e) life line");
			result = sc.next();
			if (result.equalsIgnoreCase("d")) {
				Candidate.setAmount(1000);
				return true;
			} else if (result.equalsIgnoreCase("e")) {
				if (count_life_line > 0) {
					count_life_line--;
					System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
					System.out.println("Select the life line:");
					String result1 = sc.next();
					if (result1.equalsIgnoreCase("a")) {
						if (aud_phn != 0) {
							aud_phn = 0;
							Thread.sleep(10000);
							System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
							System.out.println("Select the option");
							result = sc.next();
							if (result.equalsIgnoreCase("d")) {
								Candidate.setAmount(1000);
								return true;
							} else {
								return false;
							}
						} 
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"+ "b. 50-50\n" + "c. skip");
							System.out.println("Select the life line:");
							String result2 = sc.next();
							 if (result2.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println("a) Dennis Ritchie\n" + "d) James Gosling\n");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										Candidate.setAmount(1000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
											+ "b. 50-50 -- (not available) \n" + "c. skip");
									System.out.println("Select the life line:");
									String result3 = sc.next();
									if(result3.equalsIgnoreCase("c")) {
										if(skip_cnt!=0) {
											Candidate.setAmount(1000);
											return true;
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println(
													"a) Dennis Ritchie\n" + "b) Charles Babbage\n" + "c) Rahul Gandhi\n" + "d) James Gosling\n");
											result = sc.next();
											if (result.equalsIgnoreCase("d")) {
												Candidate.setAmount(1000);
												return true;
											}
											else
												return false;
										}
									}
									//--- need code intervention
								}
							} else if (result2.equalsIgnoreCase("c")) {
								if (skip_cnt != 0) {
									skip_cnt = 0;
									Candidate.setAmount(1000);
									return true;
								}
								else {
									//
									System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
											+ "b. 50-50 \n" + "c. skip -- (not available)");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if (result4.equalsIgnoreCase("b")) {
										if (cnt_50_50 != 0) {
											cnt_50_50 = 0;
											System.out.println("Select the options");
											System.out.println("a) Dennis Ritchie\n" + "d) James Gosling\n");
											result = sc.next();
											if (result.equalsIgnoreCase("d")) {
												Candidate.setAmount(1000);
												return true;
											} else {
												return false;
											}
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println(
													"a) Dennis Ritchie\n" + "b) Charles Babbage\n" + "c) Rahul Gandhi\n" + "d) James Gosling\n");
											result = sc.next();
											if (result.equalsIgnoreCase("d")) {
												Candidate.setAmount(1000);
												return true;
											}
											else
												return false;
										}
									}
								}
							}
						}
					}
					else if (result2.equalsIgnoreCase("b")) {
						if (cnt_50_50 != 0) {
							cnt_50_50 = 0;
							System.out.println("Select the options");
							System.out.println("a) Dennis Ritchie\n" + "d) James Gosling\n");
							result = sc.next();
							if (result.equalsIgnoreCase("d")) {
								Candidate.setAmount(1000);
								return true;
							} else {
								return false;
							}

						} else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
									+ "b. 50-50 -- (not available) \n" + "c. skip");
							System.out.println("Select the life line:");
							String result3 = sc.next();
							if (result3.equalsIgnoreCase("a")) {
								if (aud_phn != 0) {
									aud_phn = 0;
									Thread.sleep(1000);
									System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										Candidate.setAmount(1000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
											+ "b. 50-50 -- (not available) \n" + "c. skip");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if(result4.equalsIgnoreCase("c")) {
										if(skip_cnt!=0) {
											Candidate.setAmount(1000);
											return true;
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println(
													"a) Dennis Ritchie\n" + "b) Charles Babbage\n" + "c) Rahul Gandhi\n" + "d) James Gosling\n");
											result = sc.next();
											if (result.equalsIgnoreCase("d")) {
												Candidate.setAmount(1000);
												return true;
											}
											else
												return false;
										}
									}
									//--- need code intervention
								}
							} else if (result2.equalsIgnoreCase("c")) {
								if (skip_cnt != 0) {
									skip_cnt = 0;
									Candidate.setAmount(1000);
									return true;
								}
								else {
									//
									System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
											+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
									System.out.println("Select the life line:");
									String result5 = sc.next();
									if (result5.equalsIgnoreCase("b")) {
										if (aud_phn != 0) {
											aud_phn = 0;
											Thread.sleep(1000);
											System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
											System.out.println("Select the option");
											result = sc.next();
											if (result.equalsIgnoreCase("d")) {
												Candidate.setAmount(1000);
												return true;
											} else {
												return false;
											}
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println(
													"a) Dennis Ritchie\n" + "b) Charles Babbage\n" + "c) Rahul Gandhi\n" + "d) James Gosling\n");
											result = sc.next();
											if (result.equalsIgnoreCase("d")) {
												Candidate.setAmount(1000);
												return true;
											}
											else
												return false;
										}
									}
								}
							}
						}
					}

					else if (result2.equalsIgnoreCase("c")) {
						if (skip_cnt != 0) {
							skip_cnt = 0;
							Candidate.setAmount(1000);
							return true;
						} else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
									+ "b. 50-50  \n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result3 = sc.next();
							if (result3.equalsIgnoreCase("a")) {
								if (aud_phn != 0) {
									aud_phn = 0;
									Thread.sleep(10000);
									System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										Candidate.setAmount(1000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
											+ "b. 50-50  \n" + "c. skip -- (not available)");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if(result4.equalsIgnoreCase("b")) {
										if (cnt_50_50 != 0) {
											cnt_50_50 = 0;
											System.out.println("Select the options");
											System.out.println("a) Dennis Ritchie\n" + "d) James Gosling\n");
											result = sc.next();
											if (result.equalsIgnoreCase("d")) {
												Candidate.setAmount(1000);
												return true;
											} else {
												return false;
											}
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println(
													"a) Dennis Ritchie\n" + "b) Charles Babbage\n" + "c) Rahul Gandhi\n" + "d) James Gosling\n");
											result = sc.next();
											if (result.equalsIgnoreCase("d")) {
												Candidate.setAmount(1000);
												return true;
											}
											else
												return false;
										}
									}
									//--- need code intervention
								}
							} else if (result2.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println("a) Dennis Ritchie\n" + "d) James Gosling\n");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										Candidate.setAmount(1000);
										return true;
									} else {
										return false;
									}
								}
								else {
									//
									System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
											+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
									System.out.println("Select the life line:");
									String result6 = sc.next();
									if (result6.equalsIgnoreCase("b")) {
										if (aud_phn != 0) {
											aud_phn = 0;
											Thread.sleep(10000);
											System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
											System.out.println("Select the option");
											result = sc.next();
											if (result.equalsIgnoreCase("d")) {
												Candidate.setAmount(1000);
												return true;
											} else {
												return false;
											}
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println(
													"a) Dennis Ritchie\n" + "b) Charles Babbage\n" + "c) Rahul Gandhi\n" + "d) James Gosling\n");
											result = sc.next();
											if (result.equalsIgnoreCase("d")) {
												Candidate.setAmount(1000);
												return true;
											}
											else
												return false;
										}
									}
								}
							}
						}
					}
				}
			
				//changes in line 122
				else {
					System.out.println("You have no life line left. Please select an option:");
					System.out.println(
							"a) Dennis Ritchie\n" + "b) Charles Babbage\n" + "c) Rahul Gandhi\n" + "d) James Gosling\n");
					result = sc.next();
					if (result.equalsIgnoreCase("d")) {
						Candidate.setAmount(1000);
						return true;
					}
				}

			}


			return false;
		}
		

		public static boolean fetchQuestion2(String name) throws Exception{
			System.out.println("2. Who is the captain of RCB?");
			System.out.println("a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal\n"
					+ "e) help line");
			result = sc.next();
			if (result.equalsIgnoreCase("c")) {
				Candidate.setAmount(5000);
				return true;
			} else if (result.equalsIgnoreCase("e")) {
				if (count_life_line > 0) {
					count_life_line--;
					System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
					System.out.println("Select the life line:");
					String result2 = sc.next();
					if (result2.equalsIgnoreCase("a")) {
						if (aud_phn != 0) {
							aud_phn = 0;
							Thread.sleep(1000);
							System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 7%");
							System.out.println("Select the option");
							result = sc.next();
							if (result.equalsIgnoreCase("c")) {
								Candidate.setAmount(5000);
								return true;
							} else {
								return false;
							}
						} else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50\n" + "c. skip");
							System.out.println("Select the life line:");
							String result3 = sc.next();
							if (result3.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println("b) Maxwell\n" + "c) Faf duplesis\n");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										Candidate.setAmount(5000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
											+ "b. 50-50 -- (not available) \n" + "c. skip");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if(result4.equalsIgnoreCase("c")) {
										if(skip_cnt!=0) {
											Candidate.setAmount(5000);
											return true;
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println("a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
											result = sc.next();
											if (result.equalsIgnoreCase("2")) {
												Candidate.setAmount(5000);
												return true;
											}
											else
												return false;
										}
									}
									//--- need code intervention
								}
							} else if (result2.equalsIgnoreCase("c")) {
								if (skip_cnt != 0) {
									skip_cnt = 0;
									Candidate.setAmount(5000);
									return true;
								}
								else {
									//
									System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
											+ "b. 50-50 \n" + "c. skip -- (not available)");
									System.out.println("Select the life line:");
									String result7 = sc.next();
									if (result7.equalsIgnoreCase("b")) {
										if (cnt_50_50 != 0) {
											cnt_50_50 = 0;
											System.out.println("Select the options");
											System.out.println("b) Maxwell\n" + "c) Faf duplesis\n");
											result = sc.next();
											if (result.equalsIgnoreCase("c")) {
												Candidate.setAmount(5000);
												return true;
											} else {
												return false;
											}
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println("a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
											result = sc.next();
											if (result.equalsIgnoreCase("c")) {
												Candidate.setAmount(5000);
												return true;
											}
											else
												return false;
										}
									}
								}
							}
						}
					}
					else if (result2.equalsIgnoreCase("b")) {
						if (cnt_50_50 != 0) {
							cnt_50_50 = 0;
							System.out.println("Select the options");
							System.out.println("b) Maxwell\n" + "c) Faf duplesis\n");
							result = sc.next();
							if (result.equalsIgnoreCase("c")) {
								Candidate.setAmount(5000);
								return true;
							} else {
								return false;
							}

						} else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
									+ "b. 50-50 -- (not available) \n" + "c. skip");
							System.out.println("Select the life line:");
							String result3 = sc.next();
							if (result3.equalsIgnoreCase("a")) {
								if (aud_phn != 0) {
									aud_phn = 0;
									Thread.sleep(1000);
									System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 7%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										Candidate.setAmount(5000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
											+ "b. 50-50 -- (not available) \n" + "c. skip");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if(result4.equalsIgnoreCase("c")) {
										if(skip_cnt!=0) {
											Candidate.setAmount(5000);
											return true;
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println("a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
											result = sc.next();
											if (result.equalsIgnoreCase("c")) {
												Candidate.setAmount(5000);
												return true;
											}
											else
												return false;
										}
									}
									//--- need code intervention
								}
							} else if (result2.equalsIgnoreCase("c")) {
								if (skip_cnt != 0) {
									skip_cnt = 0;
									Candidate.setAmount(5000);
									return true;
								}
								else {
									//
									System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
											+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
									System.out.println("Select the life line:");
									String result8 = sc.next();
									if (result8.equalsIgnoreCase("b")) {
										if (aud_phn != 0) {
											aud_phn = 0;
											Thread.sleep(10000);
											System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 7%");
											System.out.println("Select the option");
											result = sc.next();
											if (result.equalsIgnoreCase("c")) {
												Candidate.setAmount(5000);
												return true;
											} else {
												return false;
											}
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println("a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
											result = sc.next();
											if (result.equalsIgnoreCase("c")) {
												Candidate.setAmount(5000);
												return true;
											}
											else
												return false;
										}
									}
								}
							}
						}
					}

					else if (result2.equalsIgnoreCase("c")) {
						if (skip_cnt != 0) {
							skip_cnt = 0;
							Candidate.setAmount(5000);
							return true;
						} else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
									+ "b. 50-50  \n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result3 = sc.next();
							if (result3.equalsIgnoreCase("a")) {
								if (aud_phn != 0) {
									aud_phn = 0;
									Thread.sleep(1000);
									System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 7%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										Candidate.setAmount(5000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
											+ "b. 50-50  \n" + "c. skip -- (not available)");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if(result4.equalsIgnoreCase("b")) {
										if (cnt_50_50 != 0) {
											cnt_50_50 = 0;
											System.out.println("Select the options");
											System.out.println("b) Maxwell\n" + "c) Faf duplesis\n");
											result = sc.next();
											if (result.equalsIgnoreCase("c")) {
												Candidate.setAmount(2000);
												return true;
											} else {
												return false;
											}
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println("a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
											result = sc.next();
											if (result.equalsIgnoreCase("c")) {
												Candidate.setAmount(2000);
												return true;
											}
											else
												return false;
										}
									}
									//--- need code intervention
								}
							} else if (result2.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println("a) Dennis Ritchie\n" + "d) James Gosling\n");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										Candidate.setAmount(2000);
										return true;
									} else {
										return false;
									}
								}
								else {
									//
									System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
											+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if (result4.equalsIgnoreCase("b")) {
										if (aud_phn != 0) {
											aud_phn = 0;
											Thread.sleep(10000);
											System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 7%");
											System.out.println("Select the option");
											result = sc.next();
											if (result.equalsIgnoreCase("c")) {
												Candidate.setAmount(2000);
												return true;
											} else {
												return false;
											}
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println("a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
											result = sc.next();
											if (result.equalsIgnoreCase("c")) {
												Candidate.setAmount(2000);
												return true;
											}
											else
												return false;
										}
									}
								}
							}
						}
					}
				}
				//changes in line 122
				else {
					System.out.println("You have no life line left. Please select an option:");
					System.out.println("a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
					result = sc.next();
					if (result.equalsIgnoreCase("c")) {
						Candidate.setAmount(5000);
						return true;
					}
				}

			}


			return false;
		}



	public static boolean fetchQuestion3(String name) throws Exception {
		System.out.println("3.which among the team does not have trophy in IPL");
		System.out.println("a)RCB\n" + "b) MI\n" + "c)CHENNAI\n" + "d) GUJRAT\n"
				+ "e) life line");
		result = sc.next();
		if (result.equalsIgnoreCase("a")) {
			Candidate.setAmount(10000);
			return true;
		} else if (result.equalsIgnoreCase("e")) {
			if (count_life_line > 0) {
				count_life_line--;
				System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
				System.out.println("Select the life line:");
				String result2 = sc.next();
				if (result2.equalsIgnoreCase("a")) {
					if (aud_phn != 0) {
						aud_phn = 0;
						Thread.sleep(10000);
						System.out.println("option a = 87%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 0%");
						System.out.println("Select the option");
						result = sc.next();
						if (result.equalsIgnoreCase("a")) {
							Candidate.setAmount(10000);
							return true;
						} else {
							return false;
						}
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
								+ "b. 50-50\n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a) RCB\n" + "d)GUJARAT RETURNS\n");
								result = sc.next();
								if (result.equalsIgnoreCase("a")) {
									Candidate.setAmount(10000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										Candidate.setAmount(10000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) RCB\n" + "b) MI\n" + "c) CHENNAI\n" + "d)GUJRAT RETURNS\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(1000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(1000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
										+ "b. 50-50 \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a)RCB\n" + "d) GUJRAT RETURNS\n");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											Candidate.setAmount(10000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a)RCB\n" + "b) MI\n" + "c) CHENNAI\n" + "d)GUJRAT RETURNS\n");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											Candidate.setAmount(1000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
				else if (result2.equalsIgnoreCase("b")) {
					if (cnt_50_50 != 0) {
						cnt_50_50 = 0;
						System.out.println("Select the options");
						System.out.println("a)RCB\n" + "d) GUJRAT RETURNS\n");
						result = sc.next();
						if (result.equalsIgnoreCase("a")) {
							Candidate.setAmount(1000);
							return true;
						} else {
							return false;
						}

					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50 -- (not available) \n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(10000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										Candidate.setAmount(1000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a)RCB\n" + "b) MI\n" + "c) CHENNAI\n" + "d)GUJRAT RETURNS\n");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											Candidate.setAmount(10000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(1000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 87%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 0%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											Candidate.setAmount(10000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) RCB\n" + "b) MI\n" + "c) CHENNAI\n" + "d) GUJRAT RETURNS\n");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											Candidate.setAmount(10000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}

				else if (result2.equalsIgnoreCase("c")) {
					if (skip_cnt != 0) {
						skip_cnt = 0;
						Candidate.setAmount(10000);
						return true;
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50  \n" + "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(1000);
								System.out.println("option a = 87%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 0%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("a")) {
									Candidate.setAmount(10000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50  \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a) RCB\n" + "d) GUJRAT RETURNS\n");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											Candidate.setAmount(10000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) RCB\n" + "b)MI\n" + "c) CHENNAI\n" + "d) GUJRAT RETURNS\n");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											Candidate.setAmount(10000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result2.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a)RCB\n" + "d) GUJRAT RETURNS\n");
								result = sc.next();
								if (result.equalsIgnoreCase("a")) {
									Candidate.setAmount(10000);
									return true;
								} else {
									return false;
								}
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(1000);
										System.out.println("option a = 87%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 0%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											Candidate.setAmount(10000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) RCB\n" + "b) MI\n" + "c)CHENNAI\n" + "d) GUJRAT RETURNS\n");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											Candidate.setAmount(10000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
			}
			//changes in line 122
			else {
				System.out.println("You have no life line left. Please select an option:");
				System.out.println(
						"a) RCB\n" + "b) MI\n" + "c)CHENNAI\n" + "d)GUJRAT RETURNS\n");
				result = sc.next();
				if (result.equalsIgnoreCase("a")) {
					Candidate.setAmount(10000);
					return true;
				}
			}

		}


		return false;
	 }

	public static boolean fetchQuestion4(String name) throws Exception {
		System.out.println("4.WHO IS THE RICHEST PERSON IN THE WORLD");
		System.out.println("a)AMBANI \n" + "b)BILLGATES\n" + "c)ELON MUSK \n" + "d)RICHIE RICH \n"
				+ "e) life line");
		result = sc.next();
		if (result.equalsIgnoreCase("C")) {
			Candidate.setAmount(50000);
			return true;
		} else if (result.equalsIgnoreCase("e")) {
			if (count_life_line > 0) {
				count_life_line--;
				System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
				System.out.println("Select the life line:");
				String result2 = sc.next();
				if (result2.equalsIgnoreCase("a")) {
					if (aud_phn != 0) {
						aud_phn = 0;
						Thread.sleep(1000);
						System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 87%\n" + "option d = 8%");
						System.out.println("Select the option");
						result = sc.next();
						if (result.equalsIgnoreCase("C")) {
							Candidate.setAmount(50000);
							return true;
						} else {
							return false;
						}
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
								+ "b. 50-50\n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a)AMBANI \n" + "C)ELON MUSK\n");
								result = sc.next();
								if (result.equalsIgnoreCase("C")) {
									Candidate.setAmount(50000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										Candidate.setAmount(50000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)AMBANI\n" + "b)BILLGATES\n" + "c)ELON MUSK \n" + "d)RICHIE RICH \n");
										result = sc.next();
										if (result.equalsIgnoreCase("C")) {
											Candidate.setAmount(50000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(50000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
										+ "b. 50-50 \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a)AMBANI\n" + "C)ELON MUSK \n");
										result = sc.next();
										if (result.equalsIgnoreCase("C")) {
											Candidate.setAmount(50000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) AMBANI\n" + "b) BILLGATES\n" + "c) ELON MUSK\n" + "d)RICHIE RICH  \n");
										result = sc.next();
										if (result.equalsIgnoreCase("C")) {
											Candidate.setAmount(50000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
				else if (result2.equalsIgnoreCase("b")) {
					if (cnt_50_50 != 0) {
						cnt_50_50 = 0;
						System.out.println("Select the options");
						System.out.println("a) AMBANI\n" + "C)ELON MUSK\n");
						result = sc.next();
						if (result.equalsIgnoreCase("C")) {
							Candidate.setAmount(50000);
							return true;
						} else {
							return false;
						}

					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50 -- (not available) \n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(1000);
								System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 87%\n" + "option d = 8%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("C")) {
									Candidate.setAmount(50000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										Candidate.setAmount(50000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) AMBANI\n" + "b) BILLGATES\n" + "c) ELON MUSK\n" + "d)RICHIE RICH\n");
										result = sc.next();
										if (result.equalsIgnoreCase("C")) {
											Candidate.setAmount(50000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(50000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(1000);
										System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 87%\n" + "option d = 8%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("C")) {
											Candidate.setAmount(50000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a)AMBANI\n" + "b) BILLGATES\n" + "c) ELON MUSK\n" + "d) RICHIE RICH\n");
										result = sc.next();
										if (result.equalsIgnoreCase("C")) {
											Candidate.setAmount(50000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}

				else if (result2.equalsIgnoreCase("c")) {
					if (skip_cnt != 0) {
						skip_cnt = 0;
						Candidate.setAmount(50000);
						return true;
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50  \n" + "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(1000);
								System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(50000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50  \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a)AMBANI\n" + "d) ELON MUSK\n");
										result = sc.next();
										if (result.equalsIgnoreCase("C")) {
											Candidate.setAmount(50000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a)AMBANI\n" + "b) BILLAGATES\n" + "c) ELON MUSK\n" + "d) RICHIE RICH\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(50000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result2.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a) AMBANI\n" + "C) ELON MUSK\n");
								result = sc.next();
								if (result.equalsIgnoreCase("C")) {
									Candidate.setAmount(50000);
									return true;
								} else {
									return false;
								}
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(1000);
										System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 87%\n" + "option d = 8%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("C")) {
											Candidate.setAmount(50000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) AMBANI\n" + "b) BILLAGATES\n" + "c) ELON MUSK\n" + "d) RICHIE RICH\n");
										result = sc.next();
										if (result.equalsIgnoreCase("C")) {
											Candidate.setAmount(50000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
			}
			//changes in line 122
			else {
				System.out.println("You have no life line left. Please select an option:");
				System.out.println(
						"a) AMBANI\n" + "b)BILLAGATES\n" + "c) ELON MUSK\n" + "d)RICHIE RICH\n");
				result = sc.next();
				if (result.equalsIgnoreCase("d")) {
					Candidate.setAmount(50000);
					return true;
				}
			}

		}


		return false;
	 }




	public static boolean fetchQuestion5(String name) throws Exception {
		System.out.println("5.WHICH IS THE SECOND LARGEST DOME IN THE WORLD");
		System.out.println("a)ST.MERRYS CHURCH \n" + "b)NONE OF THE ABOVE\n" + "c)BOTH A AND D\n" + "d)GOLGUMBAZ \n"
				+ "e) life line");
		result = sc.next();
		if (result.equalsIgnoreCase("D")) {
			Candidate.setAmount(300000);
			return true;
		} else if (result.equalsIgnoreCase("e")) {
			if (count_life_line > 0) {
				count_life_line--;
				System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
				System.out.println("Select the life line:");
				String result2 = sc.next();
				if (result2.equalsIgnoreCase("a")) {
					if (aud_phn != 0) {
						aud_phn = 0;
						Thread.sleep(1000);
						System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
						System.out.println("Select the option");
						result = sc.next();
						if (result.equalsIgnoreCase("D")) {
							Candidate.setAmount(300000);
							return true;
						} else {
							return false;
						}
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
								+ "b. 50-50\n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a)st.MERRYS CHURCH\n" + "d)GOLGUMBAZ\n");
								result = sc.next();
								if (result.equalsIgnoreCase("D")) {
									Candidate.setAmount(300000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										Candidate.setAmount(300000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)ST.CHURCH MARRYS\n" + "b)NONE OF THE ABOVEn" + "c)BOTH A AND D \n" + "d)GOLGUMBAZ\n");
										result = sc.next();
										if (result.equalsIgnoreCase("D")) {
											Candidate.setAmount(300000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result2.equalsIgnoreCase("C")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(300000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
										+ "b. 50-50 \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a)ST.CHURCH MARRYS\n" + "d)GOLGUMBAZ \n");
										result = sc.next();
										if (result.equalsIgnoreCase("D")) {
											Candidate.setAmount(300000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) ST.CHURCH MARRYS\n" + "b) NONE OF THE ABOVE\n" + "c) BOTH A AND D\n" + "d)GOLGUMBAZ \n");
										result = sc.next();
										if (result.equalsIgnoreCase("D")) {
											Candidate.setAmount(300000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
				else if (result2.equalsIgnoreCase("b")) {
					if (cnt_50_50 != 0) {
						cnt_50_50 = 0;
						System.out.println("Select the options");
						System.out.println("a) ST.CHURCH MARRYS\n" + "d)GOLGUMBAZ\n");
						result = sc.next();
						if (result.equalsIgnoreCase("D")) {
							Candidate.setAmount(300000);
							return true;
						} else {
							return false;
						}

					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50 -- (not available) \n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("C")) {
									Candidate.setAmount(300000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										Candidate.setAmount(300000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) ST.CHURCH MARRYS\n" + "b)NONE OF THE ABOVE\n" + "c)BOTH A AND B\n" + "d)GOLGUMBAZ\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(300000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(300000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(300000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a)ST.CHURCH MARRYS\n" + "b) NONE OF THE ABOVE\n" + "c) BOTH A AND D\n" + "d) GOLGUMBAZ\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(300000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}

				else if (result2.equalsIgnoreCase("c")) {
					if (skip_cnt != 0) {
						skip_cnt = 0;
						Candidate.setAmount(300000);
						return true;
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50  \n" + "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(1000);
								System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 87%\n" + "option d = 8%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("C")) {
									Candidate.setAmount(300000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50  \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a)ST.CHURCH MARRYS\n" + "d) GOLGUMBAZ\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(300000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a)ST.CHURCH MARRYS\n" + "b) NONE OF THE ABOVE\n" + "c) BOTH A AND D\n" + "d) GOLGUMBAZ\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(300000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result2.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a)ST.CHURCH MARRYS\n" + "d)GULGUMBAZ\n");
								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(300000);
									return true;
								} else {
									return false;
								}
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(1000);
										System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(300000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) ST.CHURCH MARRYS\n" + "b)NONE OF THE ABOVE\n" + "c)BOTH A AND D\n" + "d) GOLGUMBAZ\n");
										result = sc.next();
										if (result.equalsIgnoreCase("C")) {
											Candidate.setAmount(300000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
			}
			//changes in line 122
			else {
				System.out.println("You have no life line left. Please select an option:");
				System.out.println(
						"a) ST.CHURCH MARRYS\n" + "b)NONE OF THE ABOVE\n" + "c) BOTH A AND D\n" + "d) GOLGUMBAZ\n");
				result = sc.next();
				if (result.equalsIgnoreCase("d")) {
					Candidate.setAmount(300000);
					return true;
				}
			}

		}


		return false;
	 }






	public static boolean fetchQuestion6(String name) throws Exception {
		System.out.println("6.WHO IS HITMAN ?");
		System.out.println("a)VIRAT \n" + "b)ROHIT\n" + "c)DHONI\n" + "d)SACHIN\n"
				+ "e) life line");
		result = sc.next();
		if (result.equalsIgnoreCase("B")) {
			Candidate.setAmount(600000);
			return true;
		} else if (result.equalsIgnoreCase("e")) {
			if (count_life_line > 0) {
				count_life_line--;
				System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
				System.out.println("Select the life line:");
				String result2 = sc.next();
				if (result2.equalsIgnoreCase("a")) {
					if (aud_phn != 0) {
						aud_phn = 0;
						Thread.sleep(1000);
						System.out.println("option a = 0%\n" + "option b = 50%\n" + "option c = 25%\n" + "option d = 25%");
						System.out.println("Select the option");
						result = sc.next();
						if (result.equalsIgnoreCase("B")) {
							Candidate.setAmount(600000);
							return true;
						} else {
							return false;
						}
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
								+ "b. 50-50\n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a)VIRAT\n" + "b)ROHIT\n");
								result = sc.next();
								if (result.equalsIgnoreCase("B")) {
									Candidate.setAmount(600000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										Candidate.setAmount(600000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)VIRAT\n" + "b)ROHIT\n" + "c)DHONI\n" + "d)SACHIN\n");
										result = sc.next();
										if (result.equalsIgnoreCase("B")) {
											Candidate.setAmount(600000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result2.equalsIgnoreCase("C")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(600000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
										+ "b. 50-50 \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a)VIRAT\n" + "b)ROHIT\n");
										result = sc.next();
										if (result.equalsIgnoreCase("B")) {
											Candidate.setAmount(600000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) VIRAT\n" + "b) ROHIT\n" + "c) DHONI\n" + "d)SACHIN\n");
										result = sc.next();
										if (result.equalsIgnoreCase("B")) {
											Candidate.setAmount(600000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
				else if (result2.equalsIgnoreCase("b")) {
					if (cnt_50_50 != 0) {
						cnt_50_50 = 0;
						System.out.println("Select the options");
						System.out.println("a) VIRAT\n" + "b)ROHIT\n");
						result = sc.next();
						if (result.equalsIgnoreCase("B")) {
							Candidate.setAmount(600000);
							return true;
						} else {
							return false;
						}

					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50 -- (not available) \n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(1000);
								System.out.println("option a = 0%\n" + "option b = 50%\n" + "option c = 25%\n" + "option d = 25%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("B")) {
									Candidate.setAmount(600000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										Candidate.setAmount(600000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) VIRAT\n" + "b)ROHIT\n" + "c)DHONI\n" + "d)SACHIN\n");
										result = sc.next();
										if (result.equalsIgnoreCase("B")) {
											Candidate.setAmount(600000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(600000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(1000);
										System.out.println("option a = 0%\n" + "option b = 50%\n" + "option c = 25%\n" + "option d = 25%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("B")) {
											Candidate.setAmount(600000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a)VIRAT\n" + "b) ROHIT\n" + "c) DHONI\n" + "d) SACHIN\n");
										result = sc.next();
										if (result.equalsIgnoreCase("B")) {
											Candidate.setAmount(600000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}

				else if (result2.equalsIgnoreCase("c")) {
					if (skip_cnt != 0) {
						skip_cnt = 0;
						Candidate.setAmount(600000);
						return true;
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50  \n" + "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(1000);
								System.out.println("option a = 0%\n" + "option b = 50%\n" + "option c = 25%\n" + "option d = 25%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("B")) {
									Candidate.setAmount(600000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50  \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a)VIRAT\n" + "b) ROHIT\n");
										result = sc.next();
										if (result.equalsIgnoreCase("B")) {
											Candidate.setAmount(600000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) VIRAT\n" + "b) ROHIT\n" + "c) DHONI\n" + "d) SACHIT\n");
										result = sc.next();
										if (result.equalsIgnoreCase("B")) {
											Candidate.setAmount(600000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result2.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a)VIRAT\n" + "b)ROHIT\n");
								result = sc.next();
								if (result.equalsIgnoreCase("B")) {
									Candidate.setAmount(600000);
									return true;
								} else {
									return false;
								}
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(1000);
										System.out.println("option a = 0%\n" + "option b = 50%\n" + "option c = 25%\n" + "option d = 25%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("B")) {
											Candidate.setAmount(600000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) VIRAT\n" + "b) ROHIT\n" + "c) DHONI\n" + "d) SACHIN\n");
										result = sc.next();
										if (result.equalsIgnoreCase("B")) {
											Candidate.setAmount(600000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
			}
			//changes in line 122
			else {
				System.out.println("You have no life line left. Please select an option:");
				System.out.println(
						"a) VIRAT\n" + "b) ROHIT\n" + "c) DHONI\n" + "d) SACHIN\n");
				result = sc.next();
				if (result.equalsIgnoreCase("B")) {
					Candidate.setAmount(600000);
					return true;
				}
			}

		}


		return false;
	 }




	public static boolean fetchQuestion7(String name) throws Exception {
		System.out.println("7.WHO IS OUR PRIME MINISTER OF INDIA");
		System.out.println("a)NARENDR MODI \n" + "b)MANMOHAN SINGH\n" + "c)RAHUL GANDHI\n" + "d)SONIA GANDHI\n"
				+ "e) life line");
		result = sc.next();
		if (result.equalsIgnoreCase("A")) {
			Candidate.setAmount(1200000);
			return true;
		} else if (result.equalsIgnoreCase("e")) {
			if (count_life_line > 0) {
				count_life_line--;
				System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
				System.out.println("Select the life line:");
				String result2 = sc.next();
				if (result2.equalsIgnoreCase("a")) {
					if (aud_phn != 0) {
						aud_phn = 0;
						Thread.sleep(1000);
						System.out.println("option a = 90%\n" + "option b = 5%\n" + "option c = 3%\n" + "option d = 2%");
						System.out.println("Select the option");
						result = sc.next();
						if (result.equalsIgnoreCase("A")) {
							Candidate.setAmount(1200000);
							return true;
						} else {
							return false;
						}
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
								+ "b. 50-50\n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a)NARENDRA MODI\n" + "d)SONIA GANDHI\n");
								result = sc.next();
								if (result.equalsIgnoreCase("A")) {
									Candidate.setAmount(1200000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										Candidate.setAmount(1200000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)NARENDRA MODI\n" + "b)MANMOHAN SINGH\n" + "c)RAHUL GANDHI\n" + "d)SONIA GANDHI\n");
										result = sc.next();
										if (result.equalsIgnoreCase("A")) {
											Candidate.setAmount(1200000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result2.equalsIgnoreCase("C")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(1200000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
										+ "b. 50-50 \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a)NARENDRA MODI\n" + "d)SONIA GANDHI \n");
										result = sc.next();
										if (result.equalsIgnoreCase("A")) {
											Candidate.setAmount(1200000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) NARENDRA MODI\n" + "b) MANMOHAN SINGH\n" + "c) RAHUL GANDHI\n" + "d)SONIA GANDHI\n");
										result = sc.next();
										if (result.equalsIgnoreCase("A")) {
											Candidate.setAmount(1200000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
				else if (result2.equalsIgnoreCase("b")) {
					if (cnt_50_50 != 0) {
						cnt_50_50 = 0;
						System.out.println("Select the options");
						System.out.println("a) NARENDRA MODI\n" + "d)SONIA GANDHI\n");
						result = sc.next();
						if (result.equalsIgnoreCase("D")) {
							Candidate.setAmount(1200000);
							return true;
						} else {
							return false;
						}

					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50 -- (not available) \n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println("option a = 90%\n" + "option b = 5%\n" + "option c = 3%\n" + "option d = 2%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("A")) {
									Candidate.setAmount(1200000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										Candidate.setAmount(1200000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) NARENDRA MODI\n" + "b)MANMOHAN SINGH\n" + "c)RAHUL GANDHI\n" + "d)SONIA GANDHI\n");
										result = sc.next();
										if (result.equalsIgnoreCase("A")) {
											Candidate.setAmount(1200000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(1200000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a =90%\n" + "option b = 5%\n" + "option c = 3%\n" + "option d = 2%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("A")) {
											Candidate.setAmount(1200000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a)NARENDRA MODI\n" + "b)MANMOHAN SINGH\n" + "c) RAHUL GANDHI\n" + "d)SONIA GANDHI\n");
										result = sc.next();
										if (result.equalsIgnoreCase("A")) {
											Candidate.setAmount(1200000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}

				else if (result2.equalsIgnoreCase("c")) {
					if (skip_cnt != 0) {
						skip_cnt = 0;
						Candidate.setAmount(1200000);
						return true;
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50  \n" + "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(1000);
								System.out.println("option a = 90%\n" + "option b = 5%\n" + "option c = 3%\n" + "option d = 2%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("A")) {
									Candidate.setAmount(1200000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50  \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a)NARENDR MODI\n" + "d) SONIA GANDHI\n");
										result = sc.next();
										if (result.equalsIgnoreCase("A")) {
											Candidate.setAmount(1200000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a)NARENDRA MODI\n" + "b) MANMOHAN SINGH\n" + "c) RAHUL GANDHI\n" + "d) SONIA GANDHI\n");
										result = sc.next();
										if (result.equalsIgnoreCase("A")) {
											Candidate.setAmount(1200000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result2.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a)NARENDRA MODI\n" + "d)SONIA GANDHI\n");
								result = sc.next();
								if (result.equalsIgnoreCase("A")) {
									Candidate.setAmount(1200000);
									return true;
								} else {
									return false;
								}
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(1000);
										System.out.println("option a = 90%\n" + "option b = 5%\n" + "option c = 3%\n" + "option d = 2%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("A")) {
											Candidate.setAmount(1200000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) NARENDRA MODI\n" + "b)MANMOHAN SINGH\n" + "c)RAHUL GANDHI\n" + "d) SONIA GANDHI\n");
										result = sc.next();
										if (result.equalsIgnoreCase("A")) {
											Candidate.setAmount(1200000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
			}
			//changes in line 122
			else {
				System.out.println("You have no life line left. Please select an option:");
				System.out.println(
						"a) NARENDRA MODI\n" + "b)MANMOHAN SINGH\n" + "c) RAHUL GANDHI\n" + "d) SONIA GANDHI\n");
				result = sc.next();
				if (result.equalsIgnoreCase("A")) {
					Candidate.setAmount(1200000);
					return true;
				}
			}

		}


		return false;
	 }





	public static boolean fetchQuestion8(String name) throws Exception {
		System.out.println("8.WHICH IS THE CAPITAL OF INDIA");
		System.out.println("a)RAJSTHAN \n" + "b)UTTARAKHAND\n" + "c)DELHI\n" + "d)GOA\n"
				+ "e) life line");
		result = sc.next();
		if (result.equalsIgnoreCase("C")) {
			Candidate.setAmount(2500000);
			return true;
		} else if (result.equalsIgnoreCase("e")) {
			if (count_life_line > 0) {
				count_life_line--;
				System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
				System.out.println("Select the life line:");
				String result2 = sc.next();
				if (result2.equalsIgnoreCase("C")) {
					if (aud_phn != 0) {
						aud_phn = 0;
						Thread.sleep(1000);
						System.out.println("option a = 3%\n" + "option b = 5%\n" + "option c = 90%\n" + "option d = 2%");
						System.out.println("Select the option");
						result = sc.next();
						if (result.equalsIgnoreCase("C")) {
							Candidate.setAmount(2500000);
							return true;
						} else {
							return false;
						}
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
								+ "b. 50-50\n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a)RAJSTHAN\n" + "C)DELHI\n");
								result = sc.next();
								if (result.equalsIgnoreCase("C")) {
									Candidate.setAmount(2500000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										Candidate.setAmount(2500000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)RAJSTHAN\n" + "b)UTTARAKHAND\n" + "c)DELHI\n" + "d)GOA\n");
										result = sc.next();
										if (result.equalsIgnoreCase("C")) {
											Candidate.setAmount(2500000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result2.equalsIgnoreCase("C")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(2500000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
										+ "b. 50-50 \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a)RAJSTHAN\n" + "C)DELHI\n");
										result = sc.next();
										if (result.equalsIgnoreCase("C")) {
											Candidate.setAmount(2500000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) RAJSTHAN\n" + "b) UTTARAKHAND\n" + "c) DELHI\n" + "d)GOA\n");
										result = sc.next();
										if (result.equalsIgnoreCase("C")) {
											Candidate.setAmount(2500000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
				else if (result2.equalsIgnoreCase("b")) {
					if (cnt_50_50 != 0) {
						cnt_50_50 = 0;
						System.out.println("Select the options");
						System.out.println("a)RAJSTHAN\n" + "C)DELHI\n");
						result = sc.next();
						if (result.equalsIgnoreCase("C")) {
							Candidate.setAmount(2500000);
							return true;
						} else {
							return false;
						}

					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50 -- (not available) \n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println("option a = 3%\n" + "option b = 5%\n" + "option c = 90%\n" + "option d = 2%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("C")) {
									Candidate.setAmount(2500000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										Candidate.setAmount(2500000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) RAJSTHAN\n" + "b)UTTARAKHAND\n" + "c)DELHI\n" + "d)GOA\n");
										result = sc.next();
										if (result.equalsIgnoreCase("C")) {
											Candidate.setAmount(2500000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(2500000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(1000);
										System.out.println("option a =3%\n" + "option b = 5%\n" + "option c = 90%\n" + "option d = 2%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("C")) {
											Candidate.setAmount(2500000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a)RAJSTHAN\n" + "b)UTTARAKHAND\n" + "c)DELHI\n" + "d)GOA\n");
										result = sc.next();
										if (result.equalsIgnoreCase("C")) {
											Candidate.setAmount(2500000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}

				else if (result2.equalsIgnoreCase("c")) {
					if (skip_cnt != 0) {
						skip_cnt = 0;
						Candidate.setAmount(2500000);
						return true;
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50  \n" + "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(1000);
								System.out.println("option a = 3%\n" + "option b = 5%\n" + "option c = 90%\n" + "option d = 2%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("C")) {
									Candidate.setAmount(2500000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50  \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a)RAJSTHAN\n" + "C) DELHI\n");
										result = sc.next();
										if (result.equalsIgnoreCase("C")) {
											Candidate.setAmount(2500000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a)RAJSTHAN\n" + "b) UTTARAKHAND\n" + "c) DELHI\n" + "d) GOA\n");
										result = sc.next();
										if (result.equalsIgnoreCase("C")) {
											Candidate.setAmount(2500000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result2.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a)RAJSTHAN\n" + "C)DELHI\n");
								result = sc.next();
								if (result.equalsIgnoreCase("C")) {
									Candidate.setAmount(2500000);
									return true;
								} else {
									return false;
								}
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(1000);
										System.out.println("option a = 3%\n" + "option b = 5%\n" + "option c = 90%\n" + "option d = 2%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("C")) {
											Candidate.setAmount(2500000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) RAJSTHAN\n" + "b)UTTARAKHAND\n" + "c)DELHI\n" + "d) GOA\n");
										result = sc.next();
										if (result.equalsIgnoreCase("C")) {
											Candidate.setAmount(2500000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
			}
			//changes in line 122
			else {
				System.out.println("You have no life line left. Please select an option:");
				System.out.println(
						"a)RAJSTHAN\n" + "b)UTTARAKHAND\n" + "c) DELHI\n" + "d) GOA\n");
				result = sc.next();
				if (result.equalsIgnoreCase("C")) {
					Candidate.setAmount(2500000);
					return true;
				}
			}

		}


		return false;
	 }









	public static boolean fetchQuestion9(String name) throws Exception {
		System.out.println("9.WHO IS THE FIRST PRESIDENT OF INDIA");
		System.out.println("a)RAJENDRA PRASAD \n" + "b)PRANAB MUKHARJI\n" + "c)RAMNATH KOVIND\n" + "d)ZAKIR HUSSAIN\n"
				+ "e) life line");
		result = sc.next();
		if (result.equalsIgnoreCase("A")) {
			Candidate.setAmount(5000000);
			return true;
		} else if (result.equalsIgnoreCase("e")) {
			if (count_life_line > 0) {
				count_life_line--;
				System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
				System.out.println("Select the life line:");
				String result2 = sc.next();
				if (result2.equalsIgnoreCase("a")) {
					if (aud_phn != 0) {
						aud_phn = 0;
						Thread.sleep(1000);
						System.out.println("option a = 90%\n" + "option b = 5%\n" + "option c = 3%\n" + "option d = 2%");
						System.out.println("Select the option");
						result = sc.next();
						if (result.equalsIgnoreCase("A")) {
							Candidate.setAmount(5000000);
							return true;
						} else {
							return false;
						}
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
								+ "b. 50-50\n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a)RAJENDRA PRASAD\n" + "d)ZAKIR HUSSAIN\n");
								result = sc.next();
								if (result.equalsIgnoreCase("A")) {
									Candidate.setAmount(5000000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										Candidate.setAmount(5000000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)RAJENDRA PRASAD\n" + "b)PRANAB MUKHARJI\n" + "c)RAMNATH KOVIND\n" + "d)ZAKIR HUSSAIN\n");
										result = sc.next();
										if (result.equalsIgnoreCase("A")) {
											Candidate.setAmount(5000000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result2.equalsIgnoreCase("C")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(5000000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
										+ "b. 50-50 \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a)RAJENDRA PRASAD\n" + "d)ZAKIR HUSSAIN \n");
										result = sc.next();
										if (result.equalsIgnoreCase("A")) {
											Candidate.setAmount(5000000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) RAJENDRA PRASAD\n" + "b)PRANAB MUKHARJI\n" + "c)RAMNATH KOVIND\n" + "d)ZAKIR HUSSAIN\n");
										result = sc.next();
										if (result.equalsIgnoreCase("A")) {
											Candidate.setAmount(5000000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
				else if (result2.equalsIgnoreCase("b")) {
					if (cnt_50_50 != 0) {
						cnt_50_50 = 0;
						System.out.println("Select the options");
						System.out.println("a) RAJENDRA PRASAD\n" + "d)ZAKIR HUSSAIN\n");
						result = sc.next();
						if (result.equalsIgnoreCase("A")) {
							Candidate.setAmount(5000000);
							return true;
						} else {
							return false;
						}

					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50 -- (not available) \n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println("option a = 90%\n" + "option b = 5%\n" + "option c = 3%\n" + "option d = 2%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("A")) {
									Candidate.setAmount(5000000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										Candidate.setAmount(5000000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a)RAJENDRA PRASAD\n" + "b)PRANAB MUKHARJI\n" + "c)RAMNATH KOVIND\n" + "d)ZAKIR HUSSAIN\n");
										result = sc.next();
										if (result.equalsIgnoreCase("A")) {
											Candidate.setAmount(5000000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(5000000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a =90%\n" + "option b = 5%\n" + "option c = 3%\n" + "option d = 2%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("A")) {
											Candidate.setAmount(5000000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a)RAJENDRA PRASAD\n" + "b)PRANAB MUKHARAJI\n" + "c) RAMNATH KOVIND\n" + "d)ZAKIR HUSSAIN\n");
										result = sc.next();
										if (result.equalsIgnoreCase("A")) {
											Candidate.setAmount(1200000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}

				else if (result2.equalsIgnoreCase("c")) {
					if (skip_cnt != 0) {
						skip_cnt = 0;
						Candidate.setAmount(1200000);
						return true;
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50  \n" + "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(1000);
								System.out.println("option a = 90%\n" + "option b = 5%\n" + "option c = 3%\n" + "option d = 2%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("A")) {
									Candidate.setAmount(5000000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50  \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a)RAJENDRA PRASAD\n" + "d) ZAKIR HUSSAIN\n");
										result = sc.next();
										if (result.equalsIgnoreCase("A")) {
											Candidate.setAmount(5000000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a)RAJENDRA PRASAD\n" + "b)PRANAB MUKHARJI\n" + "c) RAMANATH KOVIND\n" + "d) ZAKIR HUSSAIN\n");
										result = sc.next();
										if (result.equalsIgnoreCase("A")) {
											Candidate.setAmount(5000000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result2.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a)RAJENDRA PRASAD\n" + "d)ZAKIR HUSSAIN\n");
								result = sc.next();
								if (result.equalsIgnoreCase("A")) {
									Candidate.setAmount(5000000);
									return true;
								} else {
									return false;
								}
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(1000);
										System.out.println("option a = 90%\n" + "option b = 5%\n" + "option c = 3%\n" + "option d = 2%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("A")) {
											Candidate.setAmount(5000000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) RAJENDRA PRASAD\n" + "b) PRANAB MUKHARJI\n" + "c) RAMNATH KOVIND\n" + "d) ZAKIR HUSSAIN \n");
										result = sc.next();
										if (result.equalsIgnoreCase("A")) {
											Candidate.setAmount(5000000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
			}
			//changes in line 122
			else {
				System.out.println("You have no life line left. Please select an option:");
				System.out.println(
						"a)RAJENDRA PRASAD\n" + "b)PRANAB MUKHARJI\n" + "c) RAMANATH KOVIND\n" + "d)ZAKIR HUSSAIN\n");
				result = sc.next();
				if (result.equalsIgnoreCase("A")) {
					Candidate.setAmount(5000000);
					return true;
				}
			}

		}


		return false;
	 }






	public static boolean fetchQuestion10(String name) throws Exception {
		System.out.println("10.WHO IS FINANCE MINISTER OF INDIA");
		System.out.println("a)MANMOHAN SINGH \n" + "b)PIYUSH GOYAL\n" + "c)ARUN JETLY\n" + "d)NIRMALA SITARAM\n"
				+ "e) life line");
		result = sc.next();
		if (result.equalsIgnoreCase("D")) {
			Candidate.setAmount(10000000);
			return true;
		} else if (result.equalsIgnoreCase("e")) {
			if (count_life_line > 0) {
				count_life_line--;
				System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
				System.out.println("Select the life line:");
				String result2 = sc.next();
				if (result2.equalsIgnoreCase("a")) {
					if (aud_phn != 0) {
						aud_phn = 0;
						Thread.sleep(1000);
						System.out.println("option a = 2%\n" + "option b = 5%\n" + "option c = 3%\n" + "option d = 90%");
						System.out.println("Select the option");
						result = sc.next();
						if (result.equalsIgnoreCase("D")) {
							Candidate.setAmount(10000000);
							return true;
						} else {
							return false;
						}
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
								+ "b. 50-50\n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a)MANMOHN SINGH\n" + "d)NIRMALA SITARAM\n");
								result = sc.next();
								if (result.equalsIgnoreCase("D")) {
									Candidate.setAmount(10000000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										Candidate.setAmount(10000000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)MANMOHAN SINGH\n" + "b)PIYUSH GOYAL\n" + "c)ARUN JETLY\n" + "d)NIRMALA SITARAM\n");
										result = sc.next();
										if (result.equalsIgnoreCase("D")) {
											Candidate.setAmount(10000000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result2.equalsIgnoreCase("C")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(10000000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
										+ "b. 50-50 \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a)MANMOHAN SINGH\n" + "d)NIRMALA SITARAM\n");
										result = sc.next();
										if (result.equalsIgnoreCase("D")) {
											Candidate.setAmount(10000000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) MANMOHAN SINGH\n" + "b) PIYUSH GOYAL\n" + "c) ARUN JETLY\n" + "d)NIRMALA SITARAM\n");
										result = sc.next();
										if (result.equalsIgnoreCase("D")) {
											Candidate.setAmount(10000000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
				else if (result2.equalsIgnoreCase("b")) {
					if (cnt_50_50 != 0) {
						cnt_50_50 = 0;
						System.out.println("Select the options");
						System.out.println("a) MANHOHAN SINGH\n" + "d)NIRMALA SITARAM\n");
						result = sc.next();
						if (result.equalsIgnoreCase("D")) {
							Candidate.setAmount(10000000);
							return true;
						} else {
							return false;
						}

					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50 -- (not available) \n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println("option a = 2%\n" + "option b = 5%\n" + "option c = 3%\n" + "option d = 90%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("D")) {
									Candidate.setAmount(10000000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										Candidate.setAmount(10000000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) MANMOHAN SINGH\n" + "b)PIYUSH GOYAL\n" + "c)ARUN JETLY\n" + "d)NIRMALA SITARAM\n");
										result = sc.next();
										if (result.equalsIgnoreCase("D")) {
											Candidate.setAmount(10000000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(10000000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a =2%\n" + "option b = 5%\n" + "option c = 3%\n" + "option d = 90%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("D")) {
											Candidate.setAmount(10000000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a)MANMOHAN SINGH\n" + "b)PIYUSH GOYAL\n" + "c) ARUN JETLY\n" + "d)NIRMALA SITARAM\n");
										result = sc.next();
										if (result.equalsIgnoreCase("D")) {
											Candidate.setAmount(10000000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}

				else if (result2.equalsIgnoreCase("c")) {
					if (skip_cnt != 0) {
						skip_cnt = 0;
						Candidate.setAmount(10000000);
						return true;
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50  \n" + "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(1000);
								System.out.println("option a = 2%\n" + "option b = 5%\n" + "option c = 3%\n" + "option d = 90%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("D")) {
									Candidate.setAmount(10000000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50  \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a)MANMOHAN SINGH\n" + "d) NIRMALA SITARAM\n");
										result = sc.next();
										if (result.equalsIgnoreCase("D")) {
											Candidate.setAmount(10000000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a)MANMOHAN SINGH\n" + "b) PIYUSH GOYAL\n" + "c)ARUN JETLY\n" + "d) NIRMALA SITARAM\n");
										result = sc.next();
										if (result.equalsIgnoreCase("D")) {
											Candidate.setAmount(10000000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result2.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a)MANMOHAN SINGH\n" + "d)NIRMALA SITARAM\n");
								result = sc.next();
								if (result.equalsIgnoreCase("D")) {
									Candidate.setAmount(10000000);
									return true;
								} else {
									return false;
								}
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(1000);
										System.out.println("option a = 2%\n" + "option b = 5%\n" + "option c = 3%\n" + "option d = 90%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("D")) {
											Candidate.setAmount(10000000);
											return true;
										} else {
											return false;
										}
									}
									else {
		System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a)MANMOHAN SINGH\n" + "b)PIYUSH GOYAL\n" + "c)ARUN JETLY\n" + "d) NIRMALA SITARAM\n");
										result = sc.next();
										if (result.equalsIgnoreCase("D")) {
											Candidate.setAmount(10000000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
			}
			//changes in line 122
			else {
		System.out.println("You have no life line left. Please select an option:");
	System.out.println("a)MANMOHAN SINGH\n" + "b)PIYUSH GOYAL\n" + "c)ARUN JETLY\n" + "d) NIRMALA SITARAM\n");
				result = sc.next();
				if (result.equalsIgnoreCase("A")) {
					Candidate.setAmount(10000000);
					return true;
				}
			}         

	          }
		return false;
	 }

	}

